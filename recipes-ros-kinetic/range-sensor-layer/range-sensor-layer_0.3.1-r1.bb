# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Navigation Layer for Range sensors like sonar and IR"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin-native costmap-2d pluginlib roscpp rospy sensor-msgs"
SRC_URI = "https://github.com/wu-robotics/navigation_layers_release/archive/release/kinetic/range_sensor_layer/0.3.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7711db99e104a7eb7cdd3e5dc9cfe788"
SRC_URI[sha256sum] = "d87283903b14db4a8dd4481dc3e105cefd130f1cb500a632d2f2ec271331411d"
S = "${WORKDIR}/navigation_layers_release-release-kinetic-range_sensor_layer-0.3.1-1"

inherit catkin
