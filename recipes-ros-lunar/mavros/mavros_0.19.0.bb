# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "MAVROS -- MAVLink extendable communication node for ROS     with proxy for Groun"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "angles boost python-empy-native cmake-modules diagnostic-msgs diagnostic-updater eigen eigen-conversions geometry-msgs libmavconn mavlink mavros-msgs message-runtime nav-msgs pluginlib rosconsole-bridge roscpp rospy sensor-msgs std-msgs std-srvs tf2-ros"
SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/lunar/mavros/0.19.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "433aba33d6ad0e9b1eecba2abf705b18"
SRC_URI[sha256sum] = "cd746061bc94ebb925b04399923a9c7796aa0f87047388baf4642a0b88bc94f7"
S = "${WORKDIR}/mavros-release-release-lunar-mavros-0.19.0-0"

inherit catkin
