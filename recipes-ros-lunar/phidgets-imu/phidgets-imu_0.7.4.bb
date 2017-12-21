# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Driver for the Phidgets Spatial 3/3/3 devices"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs diagnostic-updater imu-filter-madgwick nodelet phidgets-api pluginlib roscpp sensor-msgs std-msgs std-srvs tf"
SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/lunar/phidgets_imu/0.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b902993782e3446c83cc4258255ceae8"
SRC_URI[sha256sum] = "c7da10a9556abbc006c43b0e20436fe70ba9301f2b1ff952eea0fdee3a7087c3"
S = "${WORKDIR}/phidgets_drivers-release-release-lunar-phidgets_imu-0.7.4-0"

inherit catkin
