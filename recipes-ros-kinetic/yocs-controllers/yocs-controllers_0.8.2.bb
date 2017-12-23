# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Library for various controller types and algorithms"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp"
SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/kinetic/yocs_controllers/0.8.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d4f669724ceb3a71aa331a9a50ae1a9a"
SRC_URI[sha256sum] = "4245e367e47411753aa148e9a267d7554bc5d0b341a8c51e90be763637c7e5b0"
S = "${WORKDIR}/yujin_ocs-release-release-kinetic-yocs_controllers-0.8.2-0"

inherit catkin
