# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS packages for solving the TSP and GTSP problems using LKH heuristic"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=f5654d47d02d927c4f7a04f0a51abaa1"

DEPENDS = "catkin-native glkh-solver lkh-solver"
SRC_URI = "https://github.com/crigroup/${PN}-release/archive/release/kinetic/${PN}/0.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fce457077437d2b918ad66a1d5ebb3c5"
SRC_URI[sha256sum] = "19d10be393136d552d8d4ff8160ea94cd97d85ea2482716b02c3831ed551d575"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.1.1-0"

inherit catkin
