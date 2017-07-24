# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This library provides functionality to simplify working with the     navigation "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin marti-nav-msgs roscpp swri-transform-util"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_route_util/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b3844fd754f021b693898f1598fcfad6"
SRC_URI[sha256sum] = "6963d5166746214efaed08a2f05a3af20fe96cca30c7c1d2e11ba9f446862434"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_route_util-0.3.0-0"

inherit catkin
