# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ROS packages in this repository were created to provide an improved     alte"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native trac-ik-examples trac-ik-kinematics-plugin trac-ik-lib"
SRC_URI = "https://github.com/traclabs/trac_ik-release/archive/release/kinetic/trac_ik/1.4.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a731ae098068bcddfd0058fd8e9dcea1"
SRC_URI[sha256sum] = "7eccb70de38276f4af8a262e1f5492b592adf29665cdf2dc2c1c6ec97bdf8a16"
S = "${WORKDIR}/trac_ik-release-release-kinetic-trac_ik-1.4.7-0"

inherit catkin
