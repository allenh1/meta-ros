# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Graphical frontend for interacting with joint_trajectory_controller instances."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Modified BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=129fdeb38464449b78c8fb022f356747"

DEPENDS = "catkin control_msgs controller_manager_msgs rospy rqt_gui rqt_gui_py trajectory_msgs"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/lunar/rqt_joint_trajectory_controller/0.12.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "36d5fe4fd8b281d005b0b06c2829e186"
SRC_URI[sha256sum] = "7523b5519d30d318d20103f4056a3833f66ac0228486fd39b7ec99617ea0ee33"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
