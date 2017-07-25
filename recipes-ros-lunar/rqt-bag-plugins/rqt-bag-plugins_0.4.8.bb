# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_bag provides a GUI plugin for displaying and replaying ROS bag files."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs python-cairo python-imaging rosbag roslib rospy rqt-bag rqt-gui rqt-gui-py rqt-plot sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros-gbp/rqt_bag-release/archive/release/lunar/rqt_bag_plugins/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "330cdf6b063d25688c489afc781a6648"
SRC_URI[sha256sum] = "60bc09e5bc568a9ded027ab7bdadb572eac72e6d70d3a3ea64bf6afdea44dab3"
S = "${WORKDIR}/rqt_bag-release-release-lunar-rqt_bag_plugins-0.4.8-0"

inherit catkin
