# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS packages for the thormang3_tools (meta package)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native thormang3-action-editor thormang3-offset-tuner-server"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-THORMANG-Tools-release/archive/release/kinetic/thormang3_tools/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e2b279a5be23d77c8287473d51520605"
SRC_URI[sha256sum] = "6ff007c673ad4539b4c421ccfb037f1c2c67c7f00ca03c02e05e0247f6308bc4"
S = "${WORKDIR}/ROBOTIS-THORMANG-Tools-release-release-kinetic-thormang3_tools-0.1.2-0"

inherit catkin
