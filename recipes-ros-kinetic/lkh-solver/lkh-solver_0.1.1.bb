# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS package for solving the Traveling Salesman Problem using the     Lin-Kernigh"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f5654d47d02d927c4f7a04f0a51abaa1"

DEPENDS = "catkin-native resource-retriever roscpp"
SRC_URI = "https://github.com/crigroup/lkh-release/archive/release/kinetic/lkh_solver/0.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f3b849e707d9c802a17f46988f03629c"
SRC_URI[sha256sum] = "748f67711adbad6e79cecca25ce73c1156f8dfe5708828ecb000f2c81db4b4b7"
S = "${WORKDIR}/lkh-release-release-kinetic-lkh_solver-0.1.1-0"

inherit catkin
