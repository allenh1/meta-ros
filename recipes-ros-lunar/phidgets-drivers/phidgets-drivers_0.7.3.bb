# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "API and ROS drivers for Phidgets devices"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=5c3b70795c9e04c7d5df7ebe6dfa4666"

DEPENDS = "catkin libphidget21 phidgets-api phidgets-imu"
SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/lunar/phidgets_drivers/0.7.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "191c264f300388ea23aec13b32a3f796"
SRC_URI[sha256sum] = "565ddb712bdb5aa9d22c8002f2078732b43dcc2052358487c9d77ad2456152d8"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
