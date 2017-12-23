# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains the xxx.machine files that describe the different hosts a "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/pr2-gbp/pr2_common-release/archive/release/kinetic/pr2_machine/1.12.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dad8bdc61a2d69b07f1dd80acbec84b6"
SRC_URI[sha256sum] = "48e6642f852df36e5e12f9693a7876a2119689b7db1c4fcfeeaf95ca57c4cfc5"
S = "${WORKDIR}/pr2_common-release-release-kinetic-pr2_machine-1.12.0-0"

inherit catkin
