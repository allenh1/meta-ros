# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Driver for the Phidgets Spatial 3/3/3 devices"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs diagnostic-updater imu-filter-madgwick nodelet phidgets-api pluginlib roscpp sensor-msgs std-msgs std-srvs tf"
SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/kinetic/phidgets_imu/0.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "286781fa286b5bfa48c9b968f7f3a6cd"
SRC_URI[sha256sum] = "2ff2240f301687db94a194ae5428d933a23d0db400531040a795ca2633ca3db8"
S = "${WORKDIR}/phidgets_drivers-release-release-kinetic-phidgets_imu-0.7.4-0"

inherit catkin
