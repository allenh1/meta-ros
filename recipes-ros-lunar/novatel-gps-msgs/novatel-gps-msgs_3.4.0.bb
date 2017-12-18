# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages for proprietary (non-NMEA) sentences from Novatel GPS receivers."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "Southwest-Research-Institute-Proprietary"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=0ecd2b809a714729aa61f2072c17e9ad"

DEPENDS = "catkin-native catkin message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/novatel_gps_driver-release/archive/release/lunar/novatel_gps_msgs/3.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "50facf310354c64914aff151596f46c2"
SRC_URI[sha256sum] = "5939f338376c4d80044add9502bb6860fb6fbdc858b82567a3ff69ce16412d53"
S = "${WORKDIR}/novatel_gps_driver-release-release-lunar-novatel_gps_msgs-3.4.0-0"

inherit catkin
