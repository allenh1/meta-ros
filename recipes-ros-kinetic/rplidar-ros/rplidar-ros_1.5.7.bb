# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rplidar ros package, support rplidar A2/A1"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rosconsole roscpp sensor-msgs std-srvs"
SRC_URI = "https://github.com/kintzhao/rplidar_ros-release/archive/release/kinetic/rplidar_ros/1.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9c5d656fe4de4faf5771cabdfe42b8fc"
SRC_URI[sha256sum] = "0e83eb65424c9e293b625e9215ea3dbe66b61663b9b35c1d79ddabdf03a828e4"
S = "${WORKDIR}/rplidar_ros-release-release-kinetic-rplidar_ros-1.5.7-0"

inherit catkin
