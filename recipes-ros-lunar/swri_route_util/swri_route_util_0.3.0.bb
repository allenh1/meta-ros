# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This library provides functionality to simplify working with the
    navigation "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=92f3ed0d9f19e7196461229cb72e4a06"

DEPENDS = "catkin marti_nav_msgs roscpp swri_transform_util"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_route_util/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b3844fd754f021b693898f1598fcfad6"
SRC_URI[sha256sum] = "6963d5166746214efaed08a2f05a3af20fe96cca30c7c1d2e11ba9f446862434"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
