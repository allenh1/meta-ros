# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "marti_sensor_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/lunar/marti_sensor_msgs/0.0.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "aac784ca18375bb3cfb61be48b43a406"
SRC_URI[sha256sum] = "40410cfe565602c2db2b023e0ba3a4cb78d0e03f17150c20f607ece688b75d61"
S = "${WORKDIR}/marti_messages-release-release-lunar-marti_sensor_msgs-0.0.9-0"

inherit catkin
