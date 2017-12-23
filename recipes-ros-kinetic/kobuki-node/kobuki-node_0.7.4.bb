# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS nodelet for Kobuki: ROS wrapper for the Kobuki driver."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles capabilities catkin-native diagnostic-aggregator diagnostic-msgs diagnostic-updater ecl-exceptions ecl-sigslots ecl-streams ecl-threads geometry-msgs kobuki-driver kobuki-ftdi kobuki-keyop kobuki-msgs kobuki-rapps kobuki-safety-controller nav-msgs nodelet pluginlib roscpp rospy sensor-msgs std-msgs tf"
SRC_URI = "https://github.com/yujinrobot-release/kobuki-release/archive/release/kinetic/kobuki_node/0.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "52d1948aeaeaccb8f8e20822ea5a9b88"
SRC_URI[sha256sum] = "eb491dccdcf1d756458127abd26ca49222831a1387678d2d5692d1185066af3b"
S = "${WORKDIR}/kobuki-release-release-kinetic-kobuki_node-0.7.4-0"

inherit catkin
