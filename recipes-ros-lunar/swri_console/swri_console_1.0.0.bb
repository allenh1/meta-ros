# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=14;endline=14;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin libqt5-core libqt5-gui libqt5-opengl-dev libqt5-widgets rosbag_storage roscpp rosgraph_msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/swri_console-release/archive/release/lunar/swri_console/1.0.0-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "febc2cadcb5775fdb55bde60369cbed4"
SRC_URI[sha256sum] = "5f57fc96e5e39a97127d73494b4bb761022bf883700bf0257ceac988c9f92f51"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
