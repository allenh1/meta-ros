# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A ROS driver for the SICK TiM series of laser scanners."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin diagnostic-updater dynamic-reconfigure libusb-1.0 libusb-1.0-dev roscpp sensor-msgs"
SRC_URI = "https://github.com/uos-gbp/sick_tim-release/archive/release/lunar/sick_tim/0.0.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "16132f0761724f1c67573b04853d154f"
SRC_URI[sha256sum] = "cc427f4b390d5ca27c120e906fff1af2c6a27a9439f49a442b7cd75bcbd09bba"
S = "${WORKDIR}/sick_tim-release-release-lunar-sick_tim-0.0.11-0"

inherit catkin
