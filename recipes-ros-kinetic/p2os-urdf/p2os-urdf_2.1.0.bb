# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "URDF file descriptions for P2OS/ARCOS robot"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs kdl-parser p2os-driver p2os-msgs sensor-msgs std-msgs tf urdf"
SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/kinetic/p2os_urdf/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "115cdfe22eba7ea8264915ba74e437f7"
SRC_URI[sha256sum] = "e65cc280d2cacb0e5cf78cd065d8c6db2a55c5e3defc0c257b1dc19933411834"
S = "${WORKDIR}/p2os-release-release-kinetic-p2os_urdf-2.1.0-0"

inherit catkin
