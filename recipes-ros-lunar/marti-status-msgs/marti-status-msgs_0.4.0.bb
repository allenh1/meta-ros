# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "marti_status_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/lunar/marti_status_msgs/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3b006adb0658a6436721602721ea55b3"
SRC_URI[sha256sum] = "3ef16f74a37d820bf95c4118ad79c768313d97046028d2315002bc44cf76a18f"
S = "${WORKDIR}/marti_messages-release-release-lunar-marti_status_msgs-0.4.0-0"

inherit catkin
