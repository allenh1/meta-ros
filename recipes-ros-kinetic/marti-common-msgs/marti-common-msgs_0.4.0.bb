# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "marti_common_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/kinetic/marti_common_msgs/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b303b311cd8a5f52d6240e2b617278e5"
SRC_URI[sha256sum] = "6b08b6da62cec86fae94499b81d4c8e450a2b1bb5f687da31cfc2d1f5356443a"
S = "${WORKDIR}/marti_messages-release-release-kinetic-marti_common_msgs-0.4.0-0"

inherit catkin
