# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a collection of launch files that can be helpful in config"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin interval-intersection joint-states-settler laser-cb-detector monocam-settler urdfdom-py"
SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/lunar/calibration_launch/0.10.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "889dca02320641ab138ab3ee451275d9"
SRC_URI[sha256sum] = "7d69d59d83c669f2f88ea660aa50f8bc6a51d0a92e0916ab2dfeb5e61174c05f"
S = "${WORKDIR}/calibration-release-release-lunar-calibration_launch-0.10.14-0"

inherit catkin
