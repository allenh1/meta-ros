# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Driver for the Phidgets Spatial 3/3/3 devices"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=4376e8afededbf94b0e1c6141cd27359"

DEPENDS = "catkin diagnostic_msgs diagnostic_updater imu_filter_madgwick nodelet phidgets_api pluginlib roscpp sensor_msgs std_msgs std_srvs tf"
SRC_URI = "https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/lunar/phidgets_imu/0.7.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b6175d18bb5cde7435ef5ce3455fcc2b"
SRC_URI[sha256sum] = "951bfbd86b826646ac9fc472f3a32c16298c497d17754cee39747415acff67ec"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
