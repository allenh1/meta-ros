# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS-Industrial core stack contains packages and libraries for supporing industri"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native industrial-deprecated industrial-msgs industrial-robot-client industrial-robot-simulator industrial-trajectory-filters industrial-utils simple-message"
SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/kinetic/industrial_core/0.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f5eb9e7bf11087464ce631efd3d27c68"
SRC_URI[sha256sum] = "079cafa3905006a3fcec380ebf61d52b65ca3b58c4d14b958f018383334a9a8c"
S = "${WORKDIR}/industrial_core-release-release-kinetic-industrial_core-0.6.0-0"

inherit catkin
