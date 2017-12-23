# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a script to generate calibration launch and configurationf"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "calibration-launch catkin-native"
SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/kinetic/calibration_setup_helper/0.10.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a9940d5bc64b58fe87047a9c22aa405a"
SRC_URI[sha256sum] = "f8fe7b9c86ffdbe13ae1798395eef2b28434443a660769f591930409b59101f5"
S = "${WORKDIR}/calibration-release-release-kinetic-calibration_setup_helper-0.10.14-0"

inherit catkin
