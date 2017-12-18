# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "MAVROS -- MAVLink extendable communication node for ROS     with proxy for Groun"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "angles boost catkin-native catkin cmake-modules diagnostic-msgs diagnostic-updater eigen eigen-conversions geographic-msgs geographiclib geographiclib-tools geometry-msgs libmavconn mavlink mavros-msgs message-runtime nav-msgs pluginlib rosconsole-bridge roscpp rospy sensor-msgs std-msgs std-srvs tf2-eigen tf2-ros"
SRC_URI = "https://github.com/mavlink/${PN}-release/archive/release/lunar/${PN}/0.22.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f413e0bc6a6e400697706da0c93e7e0d"
SRC_URI[sha256sum] = "90c1fce7469b492383816e4ad97713979294bc8ed03f8917f22b06627a7a31fb"
S = "${WORKDIR}/${PN}-release-release-lunar-${PN}-0.22.0-0"

inherit catkin
