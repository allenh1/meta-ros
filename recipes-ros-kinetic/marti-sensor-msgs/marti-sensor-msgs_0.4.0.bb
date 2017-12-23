# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "marti_sensor_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/kinetic/marti_sensor_msgs/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5d2c7508ebb787d5f292450a2078444f"
SRC_URI[sha256sum] = "dafe0b885279fe0abc5e261922903981957d93feff4947a346e1b313cbcd2145"
S = "${WORKDIR}/marti_messages-release-release-kinetic-marti_sensor_msgs-0.4.0-0"

inherit catkin
