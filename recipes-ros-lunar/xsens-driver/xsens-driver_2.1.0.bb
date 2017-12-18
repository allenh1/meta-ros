# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS Driver for XSens MT/MTi/MTi-G devices."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin diagnostic-msgs geometry-msgs rospy sensor-msgs std-msgs tf"
SRC_URI = "https://github.com/ethz-asl/ethzasl_xsens_driver-release/archive/release/lunar/xsens_driver/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8e1fe98b0137b32685f5257ee08df793"
SRC_URI[sha256sum] = "d6aaa1c672ef84c2c24f35a4e8c386c6a0988a005db29efcd7bfd75b4f649714"
S = "${WORKDIR}/ethzasl_xsens_driver-release-release-lunar-xsens_driver-2.1.0-0"

inherit catkin
