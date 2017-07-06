# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin geometry_msgs python-cairo python-imaging rosbag roslib rospy rqt_bag rqt_gui rqt_gui_py rqt_plot sensor_msgs std_msgs"
SRC_URI = "https://github.com/ros-gbp/rqt_bag-release/archive/release/lunar/rqt_bag_plugins/0.4.8-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "330cdf6b063d25688c489afc781a6648"
SRC_URI[sha256sum] = "60bc09e5bc568a9ded027ab7bdadb572eac72e6d70d3a3ea64bf6afdea44dab3"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
