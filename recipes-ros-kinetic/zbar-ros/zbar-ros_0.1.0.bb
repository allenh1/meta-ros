# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Lightweight ROS wrapper for Zbar barcode/qrcode reader library (http://zbar.sour"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge nodelet roscpp roslint zbar"
SRC_URI = "https://github.com/ros-drivers-gbp/zbar_ros-release/archive/release/kinetic/zbar_ros/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "58702065a433093c5e626c15b724af20"
SRC_URI[sha256sum] = "da54b1a1cfd82fd7c6686bfcf6ffc78e124db8c06e3ab3093a3952d95407bfa2"
S = "${WORKDIR}/zbar_ros-release-release-kinetic-zbar_ros-0.1.0-0"

inherit catkin
