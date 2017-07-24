# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Listens on a ImageFeatures topic, and waits for the data to settle.      This pa"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs python-empy-native rosconsole roscpp-serialization settlerlib std-msgs"
SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/lunar/monocam_settler/0.10.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bb3599584594c850f178a0e6c5116139"
SRC_URI[sha256sum] = "810d6eca40bde653377fa9f82c2230e234eaffb80960d370cb078ab687e4ef49"
S = "${WORKDIR}/calibration-release-release-lunar-monocam_settler-0.10.14-0"

inherit catkin
