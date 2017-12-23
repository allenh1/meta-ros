# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Simple tools and catkin modules for rosjava development."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ant catkin-native java"
SRC_URI = "https://github.com/rosjava-release/rosjava_build_tools-release/archive/release/kinetic/rosjava_build_tools/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "eb3e8e4f1a3ab01a69cf05bbaa76fad1"
SRC_URI[sha256sum] = "6ef87f68da5fdb57e0faa0b4a32b8e3d722c0d17cd6268f60a14dc08b1c29fd0"
S = "${WORKDIR}/rosjava_build_tools-release-release-kinetic-rosjava_build_tools-0.3.2-0"

inherit catkin
