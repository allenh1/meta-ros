# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "MAVROS -- MAVLink extendable communication node for ROS     with proxy for Groun"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "angles boost catkin cmake-modules diagnostic-msgs diagnostic-updater eigen eigen-conversions geographic-msgs geographiclib geographiclib-tools geometry-msgs libmavconn mavlink mavros-msgs message-runtime nav-msgs pluginlib rosconsole-bridge roscpp rospy sensor-msgs std-msgs std-srvs tf2-eigen tf2-ros"
SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/lunar/mavros/0.21.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "67e757c4dd4d8b916ad74543792d15cb"
SRC_URI[sha256sum] = "d62f0f52ec7fada19501ac884f27f6e366144689841610a1783ccd74edaca333"
S = "${WORKDIR}/mavros-release-release-lunar-mavros-0.21.5-0"

inherit catkin
