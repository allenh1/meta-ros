# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS messages used in the XPP framework."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin geometry-msgs message-generation message-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/leggedrobotics/xpp-release/archive/release/lunar/xpp_msgs/1.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2a6f523b90ef68f093d936c52cc84301"
SRC_URI[sha256sum] = "823978f05f0467ae24dca038319f7777c381f65440675db763e29bb38c35c2d7"
S = "${WORKDIR}/xpp-release-release-lunar-xpp_msgs-1.0.3-0"

inherit catkin
