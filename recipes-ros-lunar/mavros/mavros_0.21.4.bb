# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "MAVROS -- MAVLink extendable communication node for ROS     with proxy for Groun"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "angles boost catkin-native cmake-modules diagnostic-msgs diagnostic-updater eigen eigen-conversions geographic-msgs geographiclib geographiclib-tools geometry-msgs libmavconn mavlink mavros-msgs message-runtime nav-msgs pluginlib rosconsole-bridge roscpp rospy sensor-msgs std-msgs std-srvs tf2-eigen tf2-ros"
SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/lunar/mavros/0.21.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9940a98a59a351f04a2e9823239a9ee8"
SRC_URI[sha256sum] = "0899f4633f9eb2c2782319912dfb79769e92e751d97147fb0136d83414ee82af"
S = "${WORKDIR}/mavros-release-release-lunar-mavros-0.21.4-0"

inherit catkin
