# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "API and ROS drivers for Phidgets devices"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=9b8b2c2c843b0cb5803c38944da723d5"

DEPENDS = "catkin libphidget21 phidgets-api phidgets-high-speed-encoder phidgets-imu"
SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/lunar/phidgets_drivers/0.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1c75939e33cfc877ec6ec10137cafb1d"
SRC_URI[sha256sum] = "f37d68a1294557dcea76a1d77bed088aec58c51b5d94f5057ef71badef848cc2"
S = "${WORKDIR}/phidgets_drivers-release-release-lunar-phidgets_drivers-0.7.4-0"

inherit catkin
