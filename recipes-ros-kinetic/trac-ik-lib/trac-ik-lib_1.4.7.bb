# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "TRAC-IK is a faster, significantly more reliable drop-in replacement for     KDL"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native cmake-modules eigen kdl-parser libnlopt-dev libnlopt0 pkgconfig roscpp urdf"
SRC_URI = "https://github.com/traclabs/trac_ik-release/archive/release/kinetic/trac_ik_lib/1.4.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a0ec3297fb2d861aa934b83304cb3f78"
SRC_URI[sha256sum] = "ad582239343f087c588a490399e1e3a873813a3977b8c620e4475ce61e70abc1"
S = "${WORKDIR}/trac_ik-release-release-kinetic-trac_ik_lib-1.4.7-0"

inherit catkin
