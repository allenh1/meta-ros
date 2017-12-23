# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Storage manager and server for WCF semantic maps."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native nav-msgs python-pymongo rospy rostest visualization-msgs warehouse-ros world-canvas-msgs world-canvas-utils"
SRC_URI = "https://github.com/yujinrobot-release/world_canvas-release/archive/release/kinetic/world_canvas_server/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e9d1af93af63a38199114dfa614590b1"
SRC_URI[sha256sum] = "30992a15d19cf71ce4f49eacc57850671e5065a73d1fd47f0752bafc33ce4c03"
S = "${WORKDIR}/world_canvas-release-release-kinetic-world_canvas_server-0.2.0-0"

inherit catkin
