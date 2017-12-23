# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Contains scripts that are useful as prefix commands for nodes     started by ros"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-psutil"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_prefix_tools/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dc973c0c167250e07719647b8aa8c9d8"
SRC_URI[sha256sum] = "6519ac09ef0a127d1d4f143f6ccb1b33a0142601f3ad37746c48683559c775c0"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_prefix_tools-2.0.0-0"

inherit catkin
