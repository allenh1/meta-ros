# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin geometry_msgs python-rospkg python_qt_binding qt_dotgraph rospy rqt_graph rqt_gui rqt_gui_py tf2 tf2_msgs tf2_ros"
SRC_URI = "https://github.com/ros-gbp/rqt_tf_tree-release/archive/release/lunar/rqt_tf_tree/0.5.7-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d793f5a47c0882de0ef37efd6b628e8a"
SRC_URI[sha256sum] = "c1e5d340c5f745c9fa2d25f2d98b51eb08b0087180e6934dc7db63da36f53591"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
