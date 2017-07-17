# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This encapsulates the Qwt dependency for a specific ROS distribution and its Qt "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "catkin"
SRC_URI = "https://github.com/ros-gbp/qwt_dependency-release/archive/release/lunar/qwt_dependency/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5247a1485530309110a77d4b485905ad"
SRC_URI[sha256sum] = "c7472d2714626ad66217e1f83c9633d931f11384bf0993f5303b902e832adb9d"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
