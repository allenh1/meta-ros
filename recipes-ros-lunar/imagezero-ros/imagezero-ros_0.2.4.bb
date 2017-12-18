# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A library that provides convenient methods for manipulating ROS images with Imag"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin cv-bridge imagezero message-runtime roscpp sensor-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/imagezero_transport-release/archive/release/lunar/imagezero_ros/0.2.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2f544b1445842212804c0900ec35be08"
SRC_URI[sha256sum] = "cae405da227ffef2c861f29c333532f3c10d9c4b56806a796f8e3f6959c14076"
S = "${WORKDIR}/imagezero_transport-release-release-lunar-imagezero_ros-0.2.4-0"

inherit catkin
