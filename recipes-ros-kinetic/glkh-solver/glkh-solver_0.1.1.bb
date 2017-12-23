# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS package for solving the Generalized Traveling Salesman Problem using     the"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f5654d47d02d927c4f7a04f0a51abaa1"

DEPENDS = "catkin-native lkh-solver roscpp"
SRC_URI = "https://github.com/crigroup/lkh-release/archive/release/kinetic/glkh_solver/0.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e126e29c91ff1270c7f6f743939418f0"
SRC_URI[sha256sum] = "178edf5606555aea5a79c12d78fc03d13398f6defb0f309ebea082f8cd8d9cb1"
S = "${WORKDIR}/lkh-release-release-kinetic-glkh_solver-0.1.1-0"

inherit catkin
