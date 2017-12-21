# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Lightweight ROS wrapper for Zbar barcode/qrcode reader library (http://zbar.sour"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge nodelet roscpp roslint zbar"
SRC_URI = "https://github.com/ros-drivers-gbp/zbar_ros-release/archive/release/lunar/zbar_ros/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a8119edf02e366b9560c2297b6202f92"
SRC_URI[sha256sum] = "c396e7a10cc45f4caa3e70b6b75d5eef4816eb1e1507702549ba3b8f3e619b39"
S = "${WORKDIR}/zbar_ros-release-release-lunar-zbar_ros-0.1.0-0"

inherit catkin
