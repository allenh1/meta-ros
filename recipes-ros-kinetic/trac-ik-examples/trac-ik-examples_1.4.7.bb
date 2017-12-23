# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains the source code for testing and comparing trac_ik"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native orocos-kdl pr2-description trac-ik-lib xacro"
SRC_URI = "https://github.com/traclabs/trac_ik-release/archive/release/kinetic/trac_ik_examples/1.4.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d55079318c61356be68029de6881cd5e"
SRC_URI[sha256sum] = "13df64264a7a947c2071ff6027fc8e3d7d9700d2d6ad31ffeb4f174778326cb9"
S = "${WORKDIR}/trac_ik-release-release-kinetic-trac_ik_examples-1.4.7-0"

inherit catkin
