# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Automatic docking for Kobuki: 	    Users owning a docking station for Kobuki can"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native ecl-geometry ecl-linear-algebra ecl-threads geometry-msgs kdl-conversions kobuki-dock-drive kobuki-msgs message-filters nav-msgs nodelet pluginlib roscpp rospy std-msgs yocs-cmd-vel-mux"
SRC_URI = "https://github.com/yujinrobot-release/kobuki-release/archive/release/kinetic/kobuki_auto_docking/0.7.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8f0e7b2263b909ba37841b31d564f2b5"
SRC_URI[sha256sum] = "c65bddcad5c39086ae5afeaf1db729edc1275a81e6ee278fb1bb2edfac6f34e3"
S = "${WORKDIR}/kobuki-release-release-kinetic-kobuki_auto_docking-0.7.4-0"

inherit catkin
