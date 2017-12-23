# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "marti_data_structures"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/kinetic/marti_data_structures/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d4213cd00af991d47d7ca633931a231e"
SRC_URI[sha256sum] = "5b583fcfb1f8cf7f09521436c8a2fe8ee2badf967456724a36a7fca551299ddb"
S = "${WORKDIR}/marti_common-release-release-kinetic-marti_data_structures-2.0.0-0"

inherit catkin
