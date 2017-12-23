# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "MAVROS -- MAVLink extendable communication node for ROS     with proxy for Groun"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-3 & LGPL-3 & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "angles boost catkin-native cmake-modules diagnostic-msgs diagnostic-updater eigen eigen-conversions geographic-msgs geographiclib geographiclib-tools geometry-msgs libmavconn mavlink mavros-msgs message-runtime nav-msgs pluginlib rosconsole-bridge roscpp rospy sensor-msgs std-msgs std-srvs tf2-eigen tf2-ros"
SRC_URI = "https://github.com/mavlink/${PN}-release/archive/release/kinetic/${PN}/0.22.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fd0774662d584d4b473312741601c6ee"
SRC_URI[sha256sum] = "9141f7f429dfd37e7c45fec90cd93c195c7795a620c5d0e87ee3e33a2b2558b9"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.22.0-0"

inherit catkin
