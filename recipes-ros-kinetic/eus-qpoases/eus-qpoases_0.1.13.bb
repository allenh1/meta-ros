# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "eus_qpoases"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native euslisp rostest subversion"
SRC_URI = "https://github.com/tork-a/jsk_control-release/archive/release/kinetic/eus_qpoases/0.1.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "15aa4af7de73694c18df8c6695f5a0ec"
SRC_URI[sha256sum] = "6ff9f22c0fceff76896df31351af2d9f13e84d2f2292c43223ec38ba87a7acc8"
S = "${WORKDIR}/jsk_control-release-release-kinetic-eus_qpoases-0.1.13-0"

inherit catkin
