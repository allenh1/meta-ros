# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Message and service definitions for the ROSflight ROS stack"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/rosflight/rosflight-release/archive/release/kinetic/rosflight_msgs/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2bf4a8210914fb9b6dc5272ce6df3b09"
SRC_URI[sha256sum] = "65ac116910ff4780d9649a65f80df9b69846e5e4fcd933b56688639130127e8c"
S = "${WORKDIR}/rosflight-release-release-kinetic-rosflight_msgs-0.1.3-0"

inherit catkin
