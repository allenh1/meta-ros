# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Tours around the waypoints"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs move-base move-base-msgs rospy std-msgs visualization-msgs"
SRC_URI = "https://github.com/jihoonl/waypoint-release/archive/release/kinetic/waypoint_touring/0.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cd537621f35942ab4f2293bbca22e603"
SRC_URI[sha256sum] = "0f2749729a69e79b2795f6bf6781468903d21e209ac17c931a73ea9f1eb04bb0"
S = "${WORKDIR}/waypoint-release-release-kinetic-waypoint_touring-0.0.1-0"

inherit catkin
