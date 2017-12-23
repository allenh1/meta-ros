# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Driver for the Phidgets Spatial 3/3/3 devices"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs diagnostic-updater imu-filter-madgwick nodelet phidgets-api pluginlib roscpp sensor-msgs std-msgs std-srvs tf"
SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/lunar/phidgets_imu/0.7.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b6175d18bb5cde7435ef5ce3455fcc2b"
SRC_URI[sha256sum] = "951bfbd86b826646ac9fc472f3a32c16298c497d17754cee39747415acff67ec"
S = "${WORKDIR}/phidgets_drivers-release-release-lunar-phidgets_imu-0.7.3-0"

inherit catkin
